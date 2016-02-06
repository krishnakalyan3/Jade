INPUTDATE=`date`
git pull
git add .
git commit -m "Commit Date $INPUTDATE"
git remote add origin_reg https://github.com/krishnakalyan3/Jade.git
git push -u origin_reg master
