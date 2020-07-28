package cmd.vardhan.client.controller;

import cmd.vardhan.client.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    SentenceService sentenceService;

    @GetMapping("/getSentence")
    String getSentence() {
        long start = System.currentTimeMillis();
        String output =
                "<h3>Some Sentences</h3><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>"
                ;
        long end = System.currentTimeMillis();
        return output + "Elapsed time (ms): " + (end - start);
    }

}
