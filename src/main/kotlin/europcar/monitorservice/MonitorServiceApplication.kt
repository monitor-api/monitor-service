package europcar.monitorservice

import mj.carthy.easyhttphandler.EnableHttpErrorHandler
import mj.carthy.easyutils.annotation.EnableValidation
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@EnableValidation
@EnableHttpErrorHandler
@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class MonitorServiceApplication

fun main(args: Array<String>) { runApplication<MonitorServiceApplication>(*args) }
