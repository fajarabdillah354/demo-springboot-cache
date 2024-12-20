package com.springboot_cache.service;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HeavyService {

    /**
     * jika data sering kita akses dan jarang berubah kita bisa menempatkannya ke dalam caching, dari pada harus menunggu lama ketika mengakses data
     * "get the data" adalah contoh data disini
     * untuk melakukan simulasi cache pertama jangan lupa tambahka dependency starter-cache
     * lalu tambahkan @EnableCaching pada class SpringBootApplication
     * setelah ini tambahkan annotation @Cacheable() pada service yang sekiranya mau di cache
     * saat melakukan test nanti pertama kali data akan tetep di load dari database misalnya sehingga memakan waktu cukup lama
     * namun setelah itu ketika di GET lagi waktu lebih cepat karna program mengambil bukan dari database lagi melainkan dari caching
     * @return
     */

    /**
     * ada banyak implementasi caching dalam springboot, misal : Redis, Hazelcast, Couchbase
     * @return
     */

    @Cacheable("data")
    public String getSomeData(){

        simulateAccessDatabase();//jadi setiap 3 detik "get the data" akan di panggil
        return "get the data";
    }


    //simulasi saat mengakses database,
    public void simulateAccessDatabase(){
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
