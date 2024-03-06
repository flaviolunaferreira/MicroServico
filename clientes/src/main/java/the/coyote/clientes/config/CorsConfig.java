package the.coyote.clientes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") // Permitir requisições apenas de http://localhost:4200
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitir os métodos GET, POST, PUT e DELETE
                .allowedHeaders("*"); // Permitir todos os cabeçalhos
    }
}
