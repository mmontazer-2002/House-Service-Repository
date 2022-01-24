package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Mahdie Montazeralzohoor on 1/24/2022 7:56 PM
 */
@ComponentScan(basePackages = " ")
@Import({DataBaseConfig.class})
@Configuration
public class SpringConfig {

}
