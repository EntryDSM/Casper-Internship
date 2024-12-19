package entry.dsm.gitauth.equusgithubauth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class EquusGithubAuthApplication

fun main(args: Array<String>) {
    runApplication<EquusGithubAuthApplication>(*args)
}
