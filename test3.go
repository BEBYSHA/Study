package main

import "fmt"

func main() {
	var score = 6

	switch {
	case score == 8:
		fmt.Println("Perfect")
	case (score < 8) && (score > 3):
		fmt.Println("Not Bad")
		fallthrough
	case score < 5:
		fmt.Println("It is ok, but please study harder")
	default:
		{
			fmt.Println("Study harder")
			fmt.Println("You need to learn more")
		}
	}
}
