#include <stdio.h> 
#include <string.h> 

char* caesar(char *plaintext, int key){
	int index = 0; 
	while (plaintext[index] != '\0'){
		plaintext[index] += key; 
		index ++; 
	}
	return plaintext; 
}

int main(void){
	int key = 2; 
	char plain[] = "Hello, World!"; 
	char *cypher = caesar(plain, key); 

	int index = 0; 
	while (cypher[index] != '\0'){
		printf("%c", cypher[index]);
		index ++; 
	}
    return 0;
}