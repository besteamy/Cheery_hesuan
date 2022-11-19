package workspace.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"workspace.controller","workspace.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
