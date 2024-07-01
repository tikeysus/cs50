#include <stdio.h> 
#include <stdlib.h>
#include <assert.h>
#include <string.h>

int len(char source[]);
char* string_slicer(char source[], int start, int end); 
void test_string_slicer();

int main(){
    test_string_slicer();
    return 0;
}

void test_string_slicer() {
    char source[] = "Hello, World!";
    
    // Test 1: Normal case
    char* slice1 = string_slicer(source, 0, 5);
    assert(strcmp(slice1, "Hello") == 0);
    free(slice1);

    // Test 2: Slice from the middle
    char* slice2 = string_slicer(source, 7, 12);
    assert(strcmp(slice2, "World") == 0);
    free(slice2);

    // Test 3: Slice the whole string
    char* slice3 = string_slicer(source, 0, strlen(source));
    assert(strcmp(slice3, "Hello, World!") == 0);
    free(slice3);

    // Test 4: Invalid range (start > end)
    char* slice4 = string_slicer(source, 5, 3);
    assert(slice4 == NULL);

    // Test 5: Invalid range (end > len(source))
    char* slice5 = string_slicer(source, 0, 20);
    assert(slice5 == NULL);

    // Test 6: Invalid range (start < 0)
    char* slice6 = string_slicer(source, -1, 5);
    assert(slice6 == NULL);

	printf("Tests completed successfully.");
}


char* string_slicer(char source[], int start, int end){
	if (start < 0 || end > len(source) || source == NULL || start > end){
		printf("Incorrect arguments for string splicer. \n"); 
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
		count++; 
	}
	slice[count] = '\0'; //null terminating so it can be used in other functions with expexted behaviour. 

	return slice; 

}

int len(char source[]){
	int i = 0; 
	while (source[i] != '\0'){
		i++; 
	}

	return i; 
}
