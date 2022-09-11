function payWithPaystack() {
    const email = document.getElementById("email").value;
   // var price = $("#price").val();
   var price = document.querySelectorAll("#price");
   var getit = document.querySelector("h6").innerHTML;
   var iterStat = $("#iterStat").val();
   var tryme = $("#tryme").html();
   // const price = document.getElementById("price").value;
    alert("iterStat: "+iterStat);
    alert("getit: "+getit);
    alert("tryme: "+tryme);
    alert("price: " + price[iterStat].value)
    const handler = PaystackPop.setup({
        key: 'pk_test_239498c3378cdd813b6ec1ce1f0a64888d939fbc',
        email: email,
        amount: 10000,
        ref: '' + Math.floor((Math.random() * 1000000000) + 1), // generates a pseudo-unique reference. Please replace with a reference you generated. Or remove the line entirely so our API will generate one for you
        metadata: {
            custom_fields: [
                {
                    display_name: "Mobile Number",
                    variable_name: "mobile_number",
                    value: "+2348012345678"
                }
            ]
        },
        callback: function (response) {
            alert('success. transaction ref is ' + response.reference);
        },
        onClose: function () {
            alert('window closed');
        }
    });
    handler.openIframe();

}