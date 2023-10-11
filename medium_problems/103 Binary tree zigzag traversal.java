// if root is null we have to return an empty list
        if(root ==null) return new ArrayList<>();
        
        // for storing the resultant list of zigzag traversal
        List<List<Integer>> list= new ArrayList<>();

        // for storing the nodes at a particular level 
        Queue<TreeNode> q= new LinkedList<>();

        // added the root to the queue so that we start the iteration
        q.offer(root);

        // This is the key factor towards approaching this question
        // We toggle this variable from true to false & vice versa
        boolean isReversed=true;

        while(!q.isEmpty()){
            int size= q.size();
            ArrayList<Integer> innerList= new ArrayList<>();
            
            // We start adding the elements at a particular level
            // to the innerList
            for(int i=0; i<size; i++){
                TreeNode current= q.poll();
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
                innerList.add(current.val);                
            }
            // This helps us to reverse the list alternatively
            if(!isReversed){
                Collections.reverse(innerList);
            }

            list.add(innerList);

            // This is to toggle the isReversed variable
            isReversed= !isReversed;

        }
        return list// if root is null we have to return an empty list
        if(root ==null) return new ArrayList<>();
        
        // for storing the resultant list of zigzag traversal
        List<List<Integer>> list= new ArrayList<>();

        // for storing the nodes at a particular level 
        Queue<TreeNode> q= new LinkedList<>();

        // added the root to the queue so that we start the iteration
        q.offer(root);

        // This is the key factor towards approaching this question
        // We toggle this variable from true to false & vice versa
        boolean isReversed=true;

        while(!q.isEmpty()){
            int size= q.size();
            ArrayList<Integer> innerList= new ArrayList<>();
            
            // We start adding the elements at a particular level
            // to the innerList
            for(int i=0; i<size; i++){
                TreeNode current= q.poll();
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
                innerList.add(current.val);                
            }
            // This helps us to reverse the list alternatively
            if(!isReversed){
                Collections.reverse(innerList);
            }

            list.add(innerList);

            // This is to toggle the isReversed variable
            isReversed= !isReversed;

        }
        return list// if root is null we have to return an empty list
        if(root ==null) return new ArrayList<>();
        
        // for storing the resultant list of zigzag traversal
        List<List<Integer>> list= new ArrayList<>();

        // for storing the nodes at a particular level 
        Queue<TreeNode> q= new LinkedList<>();

        // added the root to the queue so that we start the iteration
        q.offer(root);

        // This is the key factor towards approaching this question
        // We toggle this variable from true to false & vice versa
        boolean isReversed=true;

        while(!q.isEmpty()){
            int size= q.size();
            ArrayList<Integer> innerList= new ArrayList<>();
            
            // We start adding the elements at a particular level
            // to the innerList
            for(int i=0; i<size; i++){
                TreeNode current= q.poll();
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
                innerList.add(current.val);                
            }
            // This helps us to reverse the list alternatively
            if(!isReversed){
                Collections.reverse(innerList);
            }

            list.add(innerList);

            // This is to toggle the isReversed variable
            isReversed= !isReversed;

        }
        return list
