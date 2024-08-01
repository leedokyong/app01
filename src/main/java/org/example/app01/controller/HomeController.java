package org.example.app01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*Controller
 * - spring mvc에서 컨트롤러 역할을 수행하는 클래스임을 나타내는 어노테이션이다.
 * - @Controller 어노테이션 부착된 클래스는 애플리케이션 시작시
 *   자동으로 스캔되고 객체로 생성되어 스프링 컨테이너에서 관리한다.
 *   필요한 경우 객체가 자동 주입된다.
 * */
@Controller
public class HomeController {
    /*
     * @GetMapping("/")
     * - HandlerMapping이 이 어노테이션의 설정정보를 분석해서 "/"요청 URI가 접수되었을 때
     * 요청핸들러 메소드를 싱행해야 됨을 알아낸다.
     * */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "안녕하세요");
        // "thymeleaf" 템플릿 이름을 변환한다.
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
