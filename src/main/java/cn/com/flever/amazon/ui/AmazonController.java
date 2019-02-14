package cn.com.flever.amazon.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("amazon")
public class AmazonController {

  @RequestMapping("/hello")
  public String syaHi()
  {
    return "hello  amazon";
  }


}
