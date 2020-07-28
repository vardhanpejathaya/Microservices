package cmd.vardhan.client.dao;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ZULU-GATEWAY/services/subject")
@RibbonClient("SUBJECT")
public interface SubjectClient {

    @GetMapping("/")
    String getWord();
}
