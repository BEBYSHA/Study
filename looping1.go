package main

import "fmt"

func main() {
	for i := 0; i < 3; i++ {
		fmt.Println("Angka", i)
	}
	fmt.Println("=======")
	var a = 0
	for a < 3 {
		fmt.Println("Angka", a)
		a++
	}
	fmt.Println("=======")
	var i = 0
	for {
		fmt.Println("Angka", i)

		i++
		if i == 3 {
			break
		}
	}
}
