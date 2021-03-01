function check(f){
  if (! /^\d+$/.test(f.empno.value)){
    document.getElementById("empnoError").innerHTML= "<tt>只能是数字</tt>";
    f.empno.focus();
    f.empno.select();
    return false;
  }
  var empName = f.empName.value;
  if ("" == empName){
    f.empNameError.value ="不能为空";
    f.empName.focus();
    f.empName.select();
    return false;
  }
  if (f.job.value == ""){
      f.jobError.value ="不能为空";
      f.job.focus();
      f.job.select();
      return false;
    }
  if (! /^\d{4}-\d{2}-\d{2}$/.test(f.date.value)){
    f.dateError.value="日期格式:年-月-日, 如2021-02-28";
    f.date.focus();
    f.date.select();
    return false;
  }
  if (! (/^\d+\.\d+$/.test(f.salary.value) || /^\d+$/.test(f.salary.value) )){
    f.salaryError.value="必须是整数或小数";
    f.salary.focus();
    f.salary.select();
    return false;
  }
  if (! (/^\d+\.\d+$/.test(f.bonus.value) || /^\d+$/.test(f.bonus.value))){
    f.bonusError.value="必须是整数或小数";
    f.bonus.focus();
    f.bonus.select();
    return false;
  }
  alert("123");
  return true;
}
