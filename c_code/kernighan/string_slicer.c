#include <stdio.h> 
#include <stdlib.h> 

int len(char source[]);
char* string_slicer(char source[], int start, int end); 

int main(void){
	char source[] = {"hello my guy"}; 

	char* sub = string_slicer(source, 0, 4); 
	
	int count = 0; 
	while (sub[count] != '\0'){
		printf("%c", sub[count]); 
		count ++;
	}

	return 0; 
}

char* string_slicer(char source[], int start, int end){
	if (start < 0 || end > len(source) || source == NULL || start > end){
		printf("Incorrect arguments for string splicer"); 
		return NULL;
	}

	int max_size = end - start; 
	char* slice = malloc(max_size * sizeof(char)); 

	if (slice == NULL){
		return NULL; 
	}

	int count = 0;
	while (count < max_size){
		slice[count] = source[start + count]; 
		count ++; 
	}
	slice[count] = '\0'; //null terminating so it can be used in other functions with expexted behaviour. 

	return slice; 

}

int len(char source[]){
	int i = 0; 
	while (source[i] != '\0'){
		i ++; 
	}

	return i; 
}
