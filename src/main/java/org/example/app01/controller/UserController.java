package org.example.app01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/register")
    public String form() {
        return "form";
    }
    /*
    *요청핸들러 메소드의 매개변수 처리하기
    * 1. Model model
    *       뷰에 전달한 값을 저장할 Model객체를 생성해서 주입한다.
    * 사용자정의클래스
    *   요청파라미터값을 담는 객체로 판단함
    *   1. 객체를 생성한다.
    *   2. 객체의 멤버변수를 조사한다. (타입과 변수명)
    *   3. 요청객체의 요청파라민터에서 멤버변수과 같은 이름의 요청파라미터값을 조회해서
    *      적절한 타입으로 변환한 다음 멤버변수에 저장한다.
    *   4. 모든 멤버변수에 대하여 동일한 작업을 수행한다.
    *   5. 요청핸들러 메소드 실행할 때 매개변수의 인자로 전달한다.
    * 기본자료 형 혹은 String
    *   요청파라미터 값을 담는 변수로 판단함
    *   1. 매개변수의 변수명과 일치하는 이름의 요청파라미터값을 조회해서
    *      적절한 타입으로 변환한 다음 요청핸들러 메소드 호출할 때 매개변수 인자로 전달함.
    *   @RequestParam과 같이 사용하면 추가적인 정보를 제공할 수 있다.
    *
    *   xxx(int no) {...}
    *   - 요청파라미터에 반드시 no가 있어야함.
    *   - 요청파라미터의 이름과 변수명이 일치하는 경우 사용한다.
    *
    *   xxx(@RequestParam(name = "no") int userNO)
    *   - 요청파라미터의 이름은 no고 그 값을 담을 매개변수명은 userNo로 설정한 것이다.
    *
    *    xxx(@RequestParam(name = "id" required=false) String id)
    *   - 요청파라미터에 id가 없어도 상관없다
    *
    *   xxx(@RequestParam(name = "page" required = false defaultValue"1") int page)
    *   -요청파라미터 page는 없어도 상관없고, 없으면 기본값이 1이다
    */
    @PostMapping("/register")
    public String register(String id, String password, String name, String email) {
        return "redirect:/";
    }
}
