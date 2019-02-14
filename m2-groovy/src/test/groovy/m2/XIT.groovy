package m2

import m1.Hello
import spock.lang.Specification

class XIT extends Specification {
    def "this should work"() {
        when:
        println("This works " + new Hello("ll"))
        then:
        2+2==4
    }
}
