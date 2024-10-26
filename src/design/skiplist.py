import random


class LinkNode:
    def __init__(self, val):
        self.val = val
        self.prev = None
        self.next = None
        self.low_next = None


def linknode(node1, node2):
    if node1.next:
        tmp = node1.next
        node1.next = node2
        node2.next = tmp
        node2.prev = node1
        tmp.prev = node2
    else:
        node1.next = node2
        node2.prev = node1


def deletenode(node):
    tmp_low_next = node.low_next
    linknode(node.prev, node.next)
    if tmp_low_next:
        deletenode(tmp_low_next)


class Skiplist:
    def __init__(self):
        self.level = 4
        self.linklists = []
        for i in range(self.level):
            dummy_head = LinkNode(-1)
            self.linklists.append(dummy_head)
            if i > 0:
                self.linklists[i].low_next = self.linklists[i - 1]

    def search(self, target: int) -> bool:
        tmp_node = self.linklists[self.level - 1]
        while tmp_node.low_next:
            tmp_node = tmp_node.low_next
            while target >= tmp_node.next.val:
                tmp_node = tmp_node.next
        return tmp_node

    def add(self, num: int) -> None:
        new_node = LinkNode(num)
        p = self.search(num)

        # Coin Flip
        cur_level = 1
        prev_new_node = new_node
        while cur_level < self.level and random.random() >= 0.5:
            new_node_tmp = LinkNode(num)
            new_node_tmp.low_next = prev_new_node
            linknode(tail_nodes[cur_level], new_node_tmp)
            prev_new_node = new_node_tmp
            cur_level += 1

    def erase(self, num: int) -> bool:
        if not self.search(num):
            return False
        tmp_node = self.linklists[self.level - 1]
        while tmp_node.val != num:
            if tmp_node.val == num:
                break
            if tmp_node.val < num:
                if tmp_node.next:
                    tmp_node = tmp_node.next
                else:
                    tmp_node = tmp_node.low_next
                continue
            if tmp_node.val > num:
                tmp_node = tmp_node.prev.low_next
        deletenode(tmp_node)
        return True


# Your Skiplist object will be instantiated and called as such:
# obj = Skiplist()
# param_1 = obj.search(target)
# obj.add(num)
# param_3 = obj.erase(num)

if __name__ == "__main__":
    obj = Skiplist()
    obj.add(0)
    obj.add(5)
    obj.add(2)
    obj.add(1)
    print(obj.search(0))
    obj.erase(5)
    print(obj.search(2))
    # obj.add(5)
    print(obj.search(3))
    print(obj.search(2))
