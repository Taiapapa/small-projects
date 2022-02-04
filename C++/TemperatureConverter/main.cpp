#include <stdio.h>
#include <string.h>

int main() {
    float celsius, fahrenheit;

    printf("Please enter a temperature in Celsius: ");
    scanf("%f", &celsius);

    fahrenheit = (celsius * 9 / 5) + 32;

    printf("%.2f Celsius = %.2f Fahrenheit", celsius, fahrenheit);

    /* Trivia */
    if (celsius == -273) {
        printf("\nThat's the absolute zero temperature!");
    } else if (celsius == 0) {
        printf("\nThat's the freezing/melting point of water!");
    } else if (celsius == 37) {
        printf("\nThat's the average human body temperature!");
    } else if (celsius == 100) {
        printf("\nThat's the boiling point of water!");
    }

    return 0;
}
