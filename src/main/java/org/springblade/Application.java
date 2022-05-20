package org.springblade;

import org.springblade.constant.AppCommonConstant;
import org.springblade.core.launch.BladeApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author caizl
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BladeApplication.run(AppCommonConstant.APPLICATION_NAME, Application.class, args);
    }

}
