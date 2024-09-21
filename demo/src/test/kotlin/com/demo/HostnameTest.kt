import com.kstruct.gethostname4j.Hostname
import io.quarkus.test.junit.QuarkusTest
import org.apache.ranger.admin.client.RangerAdminRESTClient
import org.junit.jupiter.api.Test


@QuarkusTest
class HostnameTest {
    @Test
    fun testHostname() {
        val x = Hostname.getHostname()
        println(x)
        val client = RangerAdminRESTClient()
        println(client.toString())
    }
}