package main

import "fmt"

func main() {
	var score = 10

	if score > 7 {
		switch score {
		case 10:
			fmt.Println("Perfect!")
		default:
			fmt.Println("Nice!")
		}
	} else {
		if score == 5 {
			fmt.Println("Not Bad")
		} else if score == 3 {
			fmt.Println("Keep Trying")
		} else {
			fmt.Println("you can do it")
			if score == 0 {
				fmt.Println("Try harder!")
			}
		}
	}
}
