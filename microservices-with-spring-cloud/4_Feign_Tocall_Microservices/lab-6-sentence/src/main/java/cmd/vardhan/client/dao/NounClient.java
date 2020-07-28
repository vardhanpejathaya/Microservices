package cmd.vardhan.client.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("LAB-4-NOUN")
public interface NounClient {

    @GetMapping("/")
    String getWord();
}
