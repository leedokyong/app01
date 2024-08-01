package org.example.app01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 1. 스프링부트위 auto configuration 기능을 활성화 시킨다.
* 2. @Configuration 어노테이션을 이용해서 추가로 설정한 정보를 파악해서 필요한 작업을 수행함
* 3. 현재 패키지 및 모든 하위패키지에서 클래스를 스캔해서 객체를 생성하고, 객체간의 의존성을
* 조사해서 객체들을 조립한다.
* */

@SpringBootApplication
public class App01Application {

    public static void main(String[] args) {
        //아래의 메소드는 스프링 컨테이너를 생성
        //스프링 컨테이너는 위의 3번 작업을 수행한다.

        SpringApplication.run(App01Application.class, args);
    }

}
