# Appending Comments in the begining of each java file

noOfFilesModified=0

for file in $(find . -type f -name *.java);
do
   sed -i '1i /** @author Ashishkumar Gupta */' "$file"
   noOfFilesModified=$((noOfFilesModified+1))
   echo "Comments Added for $file"
done

echo -e "\n ------------------------- No of files modified: $noOfFilesModified ---------------------------"
