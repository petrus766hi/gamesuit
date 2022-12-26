fun main(){
    println("=============================================")
    println("Selamat datang di Game Suit")
    println("=============================================")
    print("Player 1 Masukan Salah Satu Saja (Batu / Gunting / Kertas) ? ")
    val player1 = readLine()!!.lowercase()
    println("=============================================")
    println("Player 2 Masukan Salah Satu Saja (Batu / Gunting / Kertas) ? ")
    val player2 = readLine()!!.lowercase()
    println("=============================================")
    println("hasil :")
    if (player1 == "gunting" && player2 == "batu"){
        println("Pemain 2 MENANG!")
    }else if ( player1 == "batu" && player2 == "kertas"){
        println("Pemain 2 MENANG!")
    }else if (player1 == "kertas" && player2 == "gunting"){
        println("Pemain 2 MENANG!")
    }else if (player1 == player2){
        println("SERI!")
    }else{
        println("Pemain 1 MENANG!")
    }
}