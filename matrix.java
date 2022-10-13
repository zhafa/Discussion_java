Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();
        
        //rumus matrix
        int kolomTambah1 = a+e;
        int kolomTambah2 = b+f;
        int kolomTambah3 = c+g;
        int kolomTambah4 = d+h;
        
        //rumus matrix 2
        int kolomKurang1 = a-e;
        int kolomKurang2 = b-f;
        int kolomKurang3 = c-g;
        int kolomKurang4 = d-h;
        
        //rumus matrix 3
        int kolomKali1 = a*e;
        int kolomKali2 = b*f;
        int kolomKali3 = c*g;
        int kolomKali4 = d*h;
        
        System.out.println("HASIL PERTAMBAHAN " + kolomTambah1 + " " + kolomTambah2 + " " + kolomTambah3 + " " + kolomTambah4 );
        System.out.println("HASIL PENGURANGAN " + kolomKurang1 + " " + kolomKurang2 + " " + kolomKurang3 + " " + kolomKurang4 );
        System.out.println("HASIL PERKALIAN " + kolomKali1 + " " + kolomKali2 + " " + kolomKali3 + " " + kolomKali4 );
