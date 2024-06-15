package hello.common;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiceImpl implements ServiceInterface {
    @Override
    public void save() {
        log.info("service 호출");
    }

    @Override
    public void find() {
        log.info("find 호출");
    }
}
