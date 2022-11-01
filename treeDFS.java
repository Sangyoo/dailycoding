import java.util.*;

public class treeDFS {
    public static void main(String[] args) {
        treeDFS.tree root = new treeDFS.tree("1");
        treeDFS.tree rootChild1 = root.addChildNode(new treeDFS.tree("2"));
        treeDFS.tree rootChild2 = root.addChildNode(new treeDFS.tree("3"));
        treeDFS.tree leaf1 = rootChild1.addChildNode(new treeDFS.tree("4"));
        treeDFS.tree leaf2 = rootChild1.addChildNode(new treeDFS.tree("5"));
        ArrayList<String> output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "5", "3"]

        leaf1.addChildNode(new treeDFS.tree("6"));
        rootChild2.addChildNode(new treeDFS.tree("7"));
        output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "6", "5", "3", "7"]
    }
    public static ArrayList<String> dfs(tree node) {
        // TODO:
        ArrayList<String> al = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        //while문을 돈다(전체 트리 사이즈만큼)
            //root node 방문 stack push
            //root node의 childe node 방문 is visited? stack push ... childe node가 없을때까지
            //leaf node al add
            //stack에서 node 하나 꺼냄
            //다시 childe node가 없을떄까지 들어감 is visited? stack push
        return new ArrayList<>();
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}

/*
*
문제
임의의 tree를 구성하는 노드 중 하나의 Node 객체를 입력받아, 해당 노드를 시작으로 깊이 우선 탐색(DFS, Depth First Search)을 합니다. 이 때, 탐색되는 순서대로 노드의 값이 저장된 배열을 리턴해야 합니다.

입력
인자 1 : node
'value', 'children' 속성을 갖는 객체 (Solution.tree)
'node.value'는 String 타입
'node.children'은 Solution.tree을 요소로 갖는 ArrayList

출력
ArrayList<String> 타입을 리턴해야 합니다.

주의사항
생성자 함수(Node)와 메소드(addChild)는 변경하지 않아야 합니다.*/