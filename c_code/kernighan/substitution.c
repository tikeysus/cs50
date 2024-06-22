#include <stdio.h>
#include <stdlib.h> 

void key_getter();
void plain_getter(); 
char* substitution(); 

int main(void) {
	substitution(); 
    return 0; 
}

char* key_getter() {
	char* key = malloc(100 * sizeof(char)); 

	if (key == NULL) {
		return;
	} 

    printf("Please enter a key: ");
    scanf("%s", key); 
    printf("\nThe key you entered is %s", key); 

	return key; 
}

char* plain_getter(){
	char* plain = malloc(100 * sizeof(char)); 

	if (plain == NULL){
		return; 
	}

	printf("\nPlease enter the plaintext: ");
	scanf("%s", plain); 
	printf("\nThe plaintext you entered is %s", plain); 

	return plain; 

}

char* substitution(){
	char* key = key_getter(); 
	char* plain = plain_getter(); 
	char* cypher = malloc(100 * sizeof(char)); 
}