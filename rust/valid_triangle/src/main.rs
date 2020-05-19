fn main() {
    
    println!("What are length of edges of triangle?");
    let mut side1 = String::new();
    let mut side2 = String::new();
    let mut side3 = String::new();

    // User enters the length
    println!("Side 1: ");
        let _ = std::io::stdin().read_line(&mut side1);
    println!("Side 2: ");
        let _ = std::io::stdin().read_line(&mut side2);
    println!("Side 3: ");
        let _ = std::io::stdin().read_line(&mut side3);
    
    // Edges are stored as String
    //  This part will parse them into i32
    let side1 = side1.trim().parse::<i32>().unwrap();
    let side2 = side2.trim().parse::<i32>().unwrap();
    let side3 = side3.trim().parse::<i32>().unwrap();

              //          side1  side2  side3 is_valid_triangle      
    println!(//              \/  \/     \/    \/ 
        "Triangle with edges {}, {} and {} is {}valid"
        , side1, side2, side3, 
        {
            // here we interpret is_valid_triangle output into str type
            if !is_valid_triangle(side1, side2, side3) {"NOT "} else {""}
        }
    );
}

fn  is_valid_triangle( edge1:i32, edge2:i32, edge3:i32 ) -> bool {
    let mut result = true;
    if  edge1 <= 0 ||
        edge2 <= 0 ||
        edge3 <= 0 {
            result = false;
        }
    if  edge1 + edge2 <= edge3 ||
        edge2 + edge3 <= edge1 ||
        edge3 + edge1 <= edge2 {
            result = false;
        }
    result
}
