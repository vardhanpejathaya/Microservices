package cmd.vardhan.client.service;

import cmd.vardhan.client.dao.*;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    VerbClient verbClient;
    @Autowired
    SubjectClient subjectClient;
    @Autowired
    ArticleCleint articleClient;
    @Autowired
    AdjectiveClient adjectiveClient;
    @Autowired
    NounClient nounClient;

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackSubject")
    public String getSubject() {
        return subjectClient.getWord();
    }

    @Override
    public String getVerb() {
        return verbClient.getWord();
    }

    @Override
    public String getArticle() {
        return articleClient.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackAdjective",
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2"),
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "500"),
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "1"),
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "1000")

            })
    public String getAdjective() {
        return adjectiveClient.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackNoun",
    commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold" , value = "2")
    })
    public String getNoun() {
        return nounClient.getWord();
    }

    public String getFallbackSubject() {
        return new String("Someone");
    }

    public String getFallbackAdjective() {
        return new String("");
    }

    public String getFallbackNoun() {
        return new String("something");
    }

}
