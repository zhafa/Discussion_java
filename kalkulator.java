Scanner input = new Scanner(System.in);
        float angka = input.nextFloat();
        char operasi = input.next().charAt(0);
        int bilangan = input.nextInt();
        input.close();
        float hasil;
        
        // rumus 
        if (operasi == '+'){
            hasil = angka + bilangan;
            System.out.printf("Hasil operasi: %.1f",hasil); 
            
        } if (operasi == '-'){
            hasil = angka - bilangan;
            System.out.printf("Hasil operasi: %.1f",hasil);
            
        } if (operasi == '/'){
            hasil = angka / bilangan;
            System.out.printf("Hasil operasi: %.1f",hasil);
         
        } if(operasi == '*'){
            hasil = angka * bilangan;
            System.out.printf("Hasil operasi: %.1f",hasil);
        
        } else {
            System.out.println("Hasil error");
        }
