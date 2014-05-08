package euler

import (
	"strconv"
	"testing"
)

func TestSumOfWords(t *testing.T) {
	m := map[string]string{
		"3":   "three",
		"13":  "thirteen",
		"23":  "twentythree",
		"34":  "thirtyfour",
		"40":  "forty",
		"33":  "thirtythree",
		"123": "onehundredandtwentythree",
		"300": "threehundred",
		"333": "threehundredandthirtythree",
	}

	for in, out := range m {
		if x := sumOfWords(in); x != len(out) {
			t.Errorf("sumOfWords(%v, %v) = %v, want %v", in, out, x, len(out))
		}
	}
}

func TestResult(t *testing.T) {
	length := len("onethousand")
	for i := 0; i < 1000; i++ {
		length = length + sumOfWords(strconv.Itoa(i))
	}
	if length != 21124 {
		t.Errorf("Incorrect result: %v. Should be 21124")
	}
}
