package kr.mjc.minbeom.java.lambdaexception;

public class GreetingEx {
    public void sayHello(Greeting greeting) {
        greeting.greet();
    }

    public void go() {
        // 1. Greeting을 구현한 영어 인사 로컬 클래스
        class EnglishGreeting implements Greeting {
            @Override
            public void greet() {
                System.out.println("Hello.");
            }
        }
        Greeting englishGreeting = new EnglishGreeting();
        sayHello(englishGreeting);

        // 2. 프랑스어 인사는 anonymous class(익명클래스) 사용
        Greeting frenchGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Bonjour.");
            }
        };
        sayHello(frenchGreeting);

        // 3. 스페인어 인사는 anonymous class를 메서드에 직접 삽입
        sayHello(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hola.");
            }
        });

        // 4. 한국어 인사는 lambda expression 사용용
        sayHello(() -> System.out.println("안녕하세요."));
    }

    public static void main(String[] args) {
        new GreetingEx().go();
    }
}
