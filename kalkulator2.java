Scanner input = new Scanner (System.in);
        float angka = input.nextFloat();
        char operasi = input.next().charAt(0);
        float bilangan = input.nextFloat();
        input.close();
        float hasil = 0;
        
        
        if (operasi == '+') {
            hasil = angka + bilangan;
            System.out.printf("Hasil operasi: %.1f",hasil);
            
        } else if (operasi == '-'){
            hasil = angka - bilangan;
            System.out.printf("Hasil operasi: %.1f",hasil);
            
        }else if (operasi == '*'){
            hasil = angka * bilangan;
            System.out.printf("Hasil operasi: %.1f",hasil);
            
        }else if (operasi =='/'){
            hasil = angka / bilangan;
            System.out.printf("Hasil operasi: %.1f",hasil);
            
        }else {
            System.out.printf("Hasil operasi: error");
        }
