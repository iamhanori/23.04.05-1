package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("test")
@Lazy
@Scope("prototype")
// type으로 가져오기
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean1의 기본생성자");
    }
}
