package hello.springAdvanced.trace.threadLocal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class FieldService {

    private String name;

    public void logic(String threadUser, String name) {

        log.info("Thread User : {}", threadUser);
        log.info("name 저장 로직 실행 : {}", name);
        this.name = name;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Thread User : {}", threadUser);
        log.info("name 조회 로직 실행 : {}", this.name);
    }
}
