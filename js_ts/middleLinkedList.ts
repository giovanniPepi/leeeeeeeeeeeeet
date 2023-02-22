// https://leetcode.com/problems/middle-of-the-linked-list/


/* class ListNode {
     val: number
     next: ListNode | null
     constructor(val?: number, next?: ListNode | null) {
         this.val = (val===undefined ? 0 : val)
         this.next = (next===undefined ? null : next)
     }
} */

function middleNode(head: ListNode | null): ListNode | null {
    let end = head.next, middle = head;
    
    while(end) {
        end = end.next?.next;
        middle = middle.next;
    }
        
    return middle;
};

