package cmd.vardhan.client.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("LAB-4-VERB")
public interface VerbClient {

    @GetMapping("/")
    String getWord();
}
