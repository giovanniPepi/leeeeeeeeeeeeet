// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

#include <stdio.h>
#include <stdlib.h>

struct ListNode {
        int val;
        struct ListNode* next;
};

int getDecimalValue(struct ListNode* head) {
        int decimal_value = 0;

        while (head != NULL) {
                decimal_value = decimal_value * 2 + head->val;
                head = head->next;
        }

        return decimal_value;
}

int main() {

        // malloc returns a void* pointer, which is a generic pointer type, 
        // we need to explicitly cast it to the desired type
        struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
        head->val = 1;

        struct ListNode* two = (struct ListNode*)malloc(sizeof(struct ListNode));
        two->val = 0;

        struct ListNode* three = (struct ListNode*)malloc(sizeof(struct ListNode));
        three->val = 1;

        head->next = two;
        two->next = three;
        three->next = NULL;

        int result = getDecimalValue(head);

        printf("Decimal value: %d\n", result);

        free(head);
        free(two);
        free(three);

        return 0;
}


