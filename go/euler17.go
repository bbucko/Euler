package euler

import (
	"fmt"
	"strconv"
	"strings"
)

func stringLen(str string) int {
	fmt.Println(str)
	return len(str)
}

func sumOfWords(number string) int {
	return stringLen(createNumberInWords(number))
}

func createNumberInWords(number string) string {
	translate := map[string]string{
		"0":   "",
		"1":   "one",
		"2":   "two",
		"3":   "three",
		"4":   "four",
		"5":   "five",
		"6":   "six",
		"7":   "seven",
		"8":   "eight",
		"9":   "nine",
		"00":  "",
		"01":  "one",
		"02":  "two",
		"03":  "three",
		"04":  "four",
		"05":  "five",
		"06":  "six",
		"07":  "seven",
		"08":  "eight",
		"09":  "nine",
		"10":  "ten",
		"11":  "eleven",
		"12":  "twelve",
		"13":  "thirteen",
		"14":  "forteen",
		"15":  "fifteen",
		"16":  "sixteen",
		"17":  "seventeen",
		"18":  "eighteen",
		"19":  "ninenteen",
		"20":  "twenty",
		"30":  "thirty",
		"40":  "forty",
		"50":  "fivty",
		"60":  "sixty",
		"70":  "seventy",
		"80":  "eighty",
		"90":  "ninety",
		"100": "hundred",
	}
	input, _ := strconv.Atoi(number)
	if input <= 20 {
		return translate[number]
	} else if input < 100 {
		return translate[string(number[0])+"0"] + translate[string(number[1])]
	} else if input < 1000 {
		arrayOfChars := strings.Split(number, "")
		var hundreds string
		if strings.Join(arrayOfChars[1:], "") == "00" {
			hundreds = strings.Join([]string{translate[string(arrayOfChars[0])], "hundred"}, "")
		} else {
			hundreds = strings.Join([]string{translate[string(arrayOfChars[0])], "hundredand"}, "")
		}
		tens := createNumberInWords(strings.Join(arrayOfChars[1:], ""))
		return strings.Join([]string{hundreds, tens}, "")
	}
	return ""
}
