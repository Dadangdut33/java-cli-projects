
class HitungBangun{
    float pi = 3.14f;
    float luasLingkaran(float r){
        float luas = this.pi * r * r; 
        
        return luas;
    }

    float kelilingLingkaran(float r){
        float pi = (float) 3.14;
        float keliling = 2 * pi * r; 
        
        return keliling;
    }

    float luasPersegiPanjang(float panjang, float lebar){
        float luas = panjang * lebar;

        return luas;
    }

    float kelilingPersegiPanjang(float panjang, float lebar){
        float keliling = 2 * (panjang + lebar);

        return keliling;
    }

    float luasJajarGenjang(float alas, float tinggi){
        float luas = alas * tinggi;

        return luas;
    }

    float kelilingJajarGenjang(float alas, float tinggi){
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        float keliling = 2 * (alas + sisiMiring);

        return keliling;
    }

    float volumeBola(float r){
        float volume = 4/3 * (this.pi * r * r * r);

        return volume;
    }

    float kelilingBola(float r){
        float keliling = 4 * this.pi * r * r;

        return keliling;
    }

    float volumeKubus(float s){
        float volume = s * s * s;

        return volume;
    }

    float kelilingKubus(float s){
        float keliling = 12 * s;

        return keliling;
    }
}