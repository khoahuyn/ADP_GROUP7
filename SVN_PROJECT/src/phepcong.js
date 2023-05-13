
var num1, num2;
var kqua;

function getValue() {
    num1 = document.getElementById("num1").value.trim();
    num2 = document.getElementById("num2").value.trim();
    try{
        num1 = new Function('return '+num1)();
    } catch {
        document.getElementById("thongtin").innerHTML = "*Must be number and not being to void*";
        try {
            num2 = new Function('return '+num2)();
        } catch {
            document.getElementById("thongtin2").innerHTML = "*Must be number and not being to void*";
        }
    }
    try {
        num2 = new Function('return '+num2)();
    } catch {
        document.getElementById("thongtin2").innerHTML = "*Must be number and not being to void*";
    }
}

function exceptions(dau) {
    if (isNaN(kqua)) {
        document.getElementById("ketqua").innerHTML = "Error!!!";
    }

    if (isNaN(num1) || num1 === "") {
        document.getElementById("thongtin").innerHTML = "*Must be number and not being to void*";

    } else if (!isNaN(num1)) {
        document.getElementById("thongtin").innerHTML = dau;
    }

    if (isNaN(num2) || num2 === "") {
        document.getElementById("thongtin2").innerHTML = "*Must be number and not being to void*";
    } else if (!isNaN(num2)) {
        document.getElementById("thongtin2").innerHTML = "";
    }

    if (num1 === "" || num2 === "" || (num1 === "" && num2 === "") || kqua == "Infinity") {
        document.getElementById("ketqua").innerHTML = "Error!!!";
    }
}

function calculator(dau) {
    getValue();
    switch (dau) {
        case "+":
            kqua = Number(num1) + Number(num2);
            break;
        case "-":
            kqua = Number(num1) - Number(num2);
            break;
        case "*":
            kqua = Number(num1) * Number(num2);
            break;
        case "/":
            kqua = Number(num1) / Number(num2);
            break;
    }
    document.getElementById("ketqua").innerHTML = "Result:" + kqua;
    exceptions(dau);
}

function click_add() {
    calculator("+");
}

function click_subtract() {
    calculator("-");
}

function click_divided() {
    calculator("/");
}

function click_multiplication() {
    calculator("*");
}

function click_reset() {
    document.getElementsByTagName("form")[0].reset();
    document.getElementById("thongtin").innerHTML = "";
    document.getElementById("thongtin2").innerHTML = "";
    document.getElementById("ketqua").innerHTML = "";
}

function click_exit() {
    if (confirm("Are you sure want to exit?") === true) {
        setTimeout(() => {
            window.close();
        }, 300);
    }
}