package com.fool.medium;
//142 环形链表Ⅱ
//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
//
// 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到
//链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
//
// 不允许修改 链表。
//
//
//
//
//
//
// 示例 1：
//
//
//
//
//输入：head = [3,2,0,-4], pos = 1
//输出：返回索引为 1 的链表节点
//解释：链表中有一个环，其尾部连接到第二个节点。
//
//
// 示例 2：
//
//
//
//
//输入：head = [1,2], pos = 0
//输出：返回索引为 0 的链表节点
//解释：链表中有一个环，其尾部连接到第一个节点。
//
//
// 示例 3：
//
//
//
//
//输入：head = [1], pos = -1
//输出：返回 null
//解释：链表中没有环。
//
//
//
//
// 提示：
//
//
// 链表中节点的数目范围在范围 [0, 104] 内
// -105 <= Node.val <= 105
// pos 的值为 -1 或者链表中的一个有效索引
//
//
//
//
// 进阶：你是否可以使用 O(1) 空间解决此题？
// Related Topics 哈希表 链表 双指针
// 👍 1334 👎 0


import com.fool.common.ListNode;


/**
 * @author Qiq
 * @date 2022/1/21
 */
public class CycleListNode {


    /**
     * 快慢指针解法：
     *      慢指针 slow    slow指针每次往后移动一个节点的位置
     *      快指针 fast    fast指针每次往后移动两个节点的位置
     *      两个指针同时从头部开始移动，如果链表有环，则两个指针必将会在环内相遇，且是在slow指针进入环的第一圈就相遇
     *
     *          假设slow指针走到环入口位置的时候，slow和fast之间的距离为x，设环的长度为n，则fast想要和slow相遇，
     *          需要追赶 n-x 的长度，而fast指针每次比slow指针多移动一个节点的位置，可以看作fast节点的追赶速度是1个节点每次，
     *          而相遇时走 n-x 次，而slow指针同样走了 n-x次，走了长度为 n-x个节点，
     *          而 n-x < n ,可以得到slow节点在没走完环的一圈就被追上，即slow在进入环的第一圈就会和fast相遇
     *
     *
     *      假设相遇时，slow指针在环内的P处，设链表头部到环入口的距离为M，环的长度为R
     *      此时slow指针走过的长度为 M+P ，fast指针走过的长度为 M+nR + P ,n为fast指针和slow指针相遇之前在环内走过的圈数
     *      又因为fast指针速度时slow指针的两倍，走过的长度也是slow指针的两倍
     *      则有：
     *          M + nR + P = 2(M+P)
     *      变换后可以得到
     *          nR = M + P
     *          M = nR - p
     *            = (n-1)R + (R-P)
     *      因为R是环的长度，所以（n-1）R的位置依然是环的入口，可以忽略，
     *      由此我们可以得到，链表头部到环入口的距离等于 R-P 即环的长度减去slow指针在环内走过的长度，即是slow指针从相遇点走到环入口的长度
     *      此时，我们再建一个 pre 指针，从head头部开始移动，slow指针从相遇点开始移动，两者再次相遇即是在环的入口处
     */
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head, fast = head;
        ListNode temp = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            if (slow == fast) {
                ListNode pre = head;
                while (pre != slow) {
                    pre = pre.next;
                    slow = slow.next;
                }
                return pre;
            }
            temp = temp.next;
        }
        return null;
    }

}
