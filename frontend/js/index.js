function loadBeer() {
  $.ajax({
    crossOrigin: true,
    url: 'http://localhost:8080/beers',
    success: function(data) {
      console.log(data);
      $('#name').val(data.name);
      $('#description').val(data.description);
      $('#abv').val(data.abv);
      $('#location').val(data.location);
      $('#type').val(data.type);
      $('#image').attr('src', data.imagePath)
    }
  });
}