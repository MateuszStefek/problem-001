package m1

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object M1App {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(M1App::class.java)
    }
}
