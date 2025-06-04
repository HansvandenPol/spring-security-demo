 package nl.hvdpol.test_1;

 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.GetMapping;

 @Controller
 public class TestController {

  @GetMapping("signInPage")
  public String signInPage() {
   return "signInPage";
  }

 }
