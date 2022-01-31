import spock.lang.Specification

class PalindromeMakerSpec extends Specification {

    def 'creates a palindrome by doubling + reversing an input string - #desc'() {
        expect:
        PalindromeMakerKt.paldindromeMaker(input) == expected

        where:
        desc                   | input         | expected
        'empty string'         | ''            | ''
        'single-letter string' | 'a'           | 'aa'
        'longer string'        | 'qwerty12345' | 'qwerty1234554321ytrewq'
    }
}
