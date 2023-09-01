const areaSwitch = document.getElementById('areaSwitch');
const perimetroSwitch = document.getElementById('perimetroSwitch');
const diametroSwitch = document.getElementById('diametroSwitch');
const inputValue = document.getElementById('inputValue');
const inputContainer = document.getElementById('inputContainer');

areaSwitch.addEventListener('change', function() {
  if (areaSwitch.checked) {
    perimetroSwitch.checked = false;
    diametroSwitch.checked = false;
    inputContainer.style.display = 'block';
  } else {
    inputContainer.style.display = 'none';
  }
});

perimetroSwitch.addEventListener('change', function() {
  if (perimetroSwitch.checked) {
    areaSwitch.checked = false;
    diametroSwitch.checked = false;
    inputContainer.style.display = 'block';
  } else {
    inputContainer.style.display = 'none';
  }
});

diametroSwitch.addEventListener('change', function() {
  if (diametroSwitch.checked) {
    areaSwitch.checked = false;
    perimetroSwitch.checked = false;
    inputContainer.style.display = 'block';
  } else {
    inputContainer.style.display = 'none';
  }
});