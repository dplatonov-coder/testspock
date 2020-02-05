import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import spock.lang.Specification

@SpringBootTest
@AutoConfigureMockMvc
@WebMvcTest
class TestControllerTest extends Specification {

    @Autowired
    private TestRestTemplate template

    def "Should return string"() {
        when:
        def result = template.getForEntity("/api", String.class)

        then:
        result.statusCode.'2xxSuccessful'
    }
}
