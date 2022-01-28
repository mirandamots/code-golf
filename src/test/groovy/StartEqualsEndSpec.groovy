import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class StartEqualsEndSpec extends Specification {

    def 'evaluates whether start equals end - #desc'() {
        expect:
        StartEqualsEndKt.startEqualsEnd(input) == expected

        where:
        desc               | input              | expected
        'empty string'     | ''                 | false
        'single character' | 'a'                | true
        'does not match'   | 'abc'              | false
        'does match'       | '8csdhfsd8'        | true
        'different case'   | 'Adksjfhsdkfjhsda' | false
    }
}